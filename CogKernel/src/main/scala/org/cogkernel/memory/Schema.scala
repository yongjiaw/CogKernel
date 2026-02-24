package org.cogkernel.memory

object Schema {
  // can delegate type systems, SerDes to external handler and LLM too
  // for initial POC, can start with JSON types and JSONata function
  object Type {
    // types should be fixed so the internal validator can verify types against instances
    // it should be exposed to the LLM so it can make the right proposals
    case class Definition()
  }

  case class Field(name: String)

  case class Definition(typeDefinition: Type.Definition,
                        fields: Map[Field, Schema.Definition])
}
