package co.jsteven.app.model.dtos

import co.jsteven.app.repository.CancionRepository


case class Nombre(nombre: String)
case class Genero(genero: String)
case class CancionDto(nombre: Nombre, genero: Genero)

object Cancion {

  def guardarCancion (cancionDto: CancionDto, cancionRepository: CancionRepository) : CancionDto = {
    cancionRepository.save(cancionDto);
  }
}
