package org.cogkernel.memory

// interface exposed to LLM for decision-making and learning/revision
// they all have internal grounded semantics to the system
// each language type should expose
// 1. self-descriptive standard for the syntax
// 2. semantic descriptions
// this is to guide LLM, and can appear in the system prompt
// LLM will read and propose the text instances based on the context
abstract class Language(text: String)

