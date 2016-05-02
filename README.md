# eLang

This is an Expression Language, with Grammar / Parser (ANTLR) / Interpreter RT / Compiler for both on-the-fly on run time & build/compile time.

It is suitable as an embedded run-time EL, not only but also build time code generation. It provides rich design-time tooling based on Xtext.

This expression language's syntax is not strictly Java-based, but can be adapted to be compatible with e.g. an existing proprietary older scripting language's syntax - possibly extending it.  The core of eLang defines no specific functions, but is intended to be extended by (possibly non-open) modules adding proprietary function definitions.

This is using Xtext and xBase now (an older version was based on xText without xBase and built it's own EL), but uses a restricted syntax (not complete xBase).

Copyright (c) 2011 - 2016 Michael Vorburger (http://www.vorburger.ch) and others.

Dual licensed under the Eclipse Public License (EPL), and starting May 2016 also under the [MIT License](http://choosealicense.com/licenses/mit/). This now permits e.g. a traditional propriertary software company to do a "closed source fork" of this code, as long as the MIT License statement and Copyright Notice remain included, and continue maintaining it in-house without sharing future changes back publicly as open source (which the Eclipse Public License would neccesarily have required if you distribute the code outside of their organization by including it in a proprietary product).

[![Build Status](https://travis-ci.org/vorburger/eLang.png?branch=master)](https://travis-ci.org/vorburger/eLang)
