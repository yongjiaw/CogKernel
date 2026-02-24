package org.cogkernel.memory


object Relationship {
  case class Role(name: String)

  case class Definition(participants: Map[Role, Participant],
                        relationBinding: RelationBinding)

  case class Participant(entity: Entity.Definition, cardinality: Cardinality)

  case class Cardinality(lower: Option[Short], upper: Option[Short])

  case class RelationBinding(code: String) extends Language(code)
  
  case class Instance(
                       schema: Relationship.Definition,
                       entities: Map[Relationship.Role, Entity.Instance]
                     )

}