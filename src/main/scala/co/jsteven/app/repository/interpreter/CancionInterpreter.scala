package co.jsteven.app.repository.interpreter

import co.jsteven.app.model.dtos.CancionDto
import co.jsteven.app.repository.CancionRepository

class CancionInterpreter extends CancionRepository{
  override def save(cancionDto: CancionDto): CancionDto = {
    System.out.println(s"se va guardar la cancion: $cancionDto ")
    cancionDto
  }
}
