package org.cogkernel.memory


object Derivation {
  case class Argument(role: Relationship.Role, fields: Set[Entity.FieldReference])

  /**
   *
   * @param relationContext
   * @param in
   * @param out
   * @param derivationFunction the output role cardinality in the relation context determines if it's an aggregate function
   */
  case class Definition(relationContext: Relationship.Definition,
                        in: Set[Argument],
                        out: Argument,
                        derivationFunction: Function)

  case class Function(code: String) extends Language(code)
}
