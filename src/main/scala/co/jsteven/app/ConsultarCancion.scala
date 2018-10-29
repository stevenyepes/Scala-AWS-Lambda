package co.jsteven.app

import co.jsteven.app.model.dtos.{Cancion, CancionDto}
import co.jsteven.app.repository.interpreter.CancionInterpreter
import com.amazonaws.services.lambda.runtime.Context
import io.github.yeghishe.lambda.{FutureHandler, Handler}
import io.circe.generic.auto._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class ConsultarCancion extends Handler[CancionDto, CancionDto]{
  override protected def handler(input: CancionDto, context: Context): CancionDto = {
    logger.info(s"cancion: $input")
    input
  }
}

class GuardarCancion extends FutureHandler[CancionDto, CancionDto] {
  override protected def handlerFuture(input: CancionDto, context: Context): Future[CancionDto] = {
    val cancionRepository = new CancionInterpreter();

    Future {
      Cancion.guardarCancion(input, cancionRepository)
    }
  }
}