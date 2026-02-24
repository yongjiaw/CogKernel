package org.cogkernel.memory

case class MetaModel(
                      substrate: Substrate,
                      timestampMs: Long,
                      lineage: Lineage)

sealed trait Substrate

/*
Best example categories
✅ 1. Data integration / ETL (your home turf)
Example:
Multiple event logs → discover:
entity types (User, Session, Transaction)
relations (user–session, session–event)
transforms (session duration, funnel conversion)
Why this is perfect:
Strong ground truth
Clear instance evidence
Obvious schema evolution
Industry-familiar
This is your killer example.
✅ 2. Program understanding
Example:
Raw execution traces
Infer:
function boundaries
dataflow relations
invariants
Why this works:
Executable validation
Rich structure
Already a known hard problem
✅ 3. Scientific data pipelines
Example:
Experimental runs
Infer:
variables
derived quantities
aggregation transforms
Why this works:
Matches scientific reasoning
Strong falsifiability
High value domain
* */