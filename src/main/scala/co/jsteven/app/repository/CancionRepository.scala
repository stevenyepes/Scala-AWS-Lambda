package co.jsteven.app.repository

import co.jsteven.app.model.dtos.CancionDto

abstract class CancionRepository {

  def save(cancionDto: CancionDto) : CancionDto
}
