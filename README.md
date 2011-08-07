# eLang

This is an Expression Language, with Grammar / Parser (ANTLR) / Interpreter RT / (TBD) Compiler for both on-the-fly on run time & build/compile time.

It is suitable as an embedded run-time EL, not only but also build time code generation. It provides rich design-time tooling based on Xtext.

This expression language's syntax is not strictly Java-based, but can be adapted to be compatible with e.g. an existing proprietary older scripting language's syntax - possibly extending it.  The core of eLang defines no specific functions, but is intended to be extended by (possibly non-open) modules adding proprietary function definitions.

While using Xtext, it's not currently built on the (new) xBase; plan to look at how it's possible to base it on / re-use (some) xBase infrastructure - while still keeping the syntax.

Copyright (c) 2011 Michael Vorburger (http://www.vorburger.ch) and others.

Licensed under the Eclipse Public License (EPL).