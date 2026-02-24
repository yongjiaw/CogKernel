package org.cogkernel.memory

object Lineage {
  case class Description(description: String) extends Language(description)
}

/**
 * the lineage trace represents structured belief state that can be inspected by external system
 * @param description describes how the substrate was created, this is additional information besides upstreams
 *               for example,
 *               entity schema can be proposed with supporting instances
 *               relationship can be hypothesized and validated
 *               instances can be predicted by the semantic model, imagined by internal simulation, or observed
 *               these represent different belief state
 * @param upstreams whatever upstream element is involved in the creation
 */
case class Lineage(description: Lineage.Description, upstreams: Set[MetaModel])
