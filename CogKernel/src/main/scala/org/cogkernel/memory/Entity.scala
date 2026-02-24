package org.cogkernel.memory

object Entity {
  case class Definition(schema: Schema.Definition,
                        primaryKey: FieldReference,
                        entityRecognition: EntityRecognition)

  case class FieldReference(path: Seq[Schema.Field])

  case class EntityRecognition(code: String) extends Language(code)
  
  case class Instance(
                       schema: Entity.Definition,
                       payload: Array[Byte]
                       // agnostic of encoding but most likely just JSON utf8, must be validated against schema
                     )

}
