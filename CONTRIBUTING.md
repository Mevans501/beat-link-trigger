# Contributing

Hi there! We're delighted that you'd like to contribute to this project.
It has been generous collaboration from many people all over the world
that has made it possible so far, and your help is key to keeping it
great.

Contributions to this project are [released][contributions-released]
to the public under the [project's open source license](LICENSE).

This project adheres to the
[Contributor Covenant Code of Conduct][covenant].
By participating, you are expected to uphold this code.

## Getting started

Before you can start contributing to Beat Link Trigger, you'll need to
set up your environment first. Fork and clone the repo and install
[Clojure][clojure] (for compiling and running the code) and
[Leiningen](https://leiningen.org) (to manage the project dependencies
and builds).

Once you have those in place, you can run BLT from source by opening a
terminal window inside your clone of the project, and typing `lein
repl`. You will see a bunch of output as the embedded copy of the User
Guide is generated by AsciiDoctorJ and the images are copied in, and
then Clojure will start, with output similar to this:

    REPL-y 0.4.3, nREPL 0.5.3
    Clojure 1.9.0
    Java HotSpot(TM) 64-Bit Server VM 1.8.0_181-b13
    beat-link-trigger loaded.
    beat-link-trigger.core=>

At that point you can type `(start)` to launch the BLT user interface
and go online, or, if you want to start out offline because you are
working without any Pioneer gear on the network, `(start true)`. In
either case, type Return or Enter to complete the command. Once the UI
is up, the REPL prompt will return, and you can poke around at viewing
and redefining functions and variable bindings.

Of course to do any serious work, you will want some sort of editor
with embedded REPL support, and ideally structural editing support for
Lisp s-expressions. We find [GNU Emacs][emacs] with [CIDER][cider] to
be an incredibly productive environment for Clojure work, but some of
our colleagues swear by [IntelliJ IDEA][idea] (even the free Community
Edition) with [Cursive][cursive], so use whatever IDE or editor works
best for you.

For testing you are going to want some Pro DJ Link hardware on your
network, and a wired network is necessary for realistic performance.
If you will be trying to analyze the protocols, you will probably want
to invest in an inexpensive managed switch, to let you span (mirror)
ports, so you can listen in on the traffic players and mixers send
between themselves. The [Netgear GS105Ev2][switch] has worked great
for us.

## Giving back

Once you have something working you’d like to share, you can open a
[pull request][pulls].

Or if you simply have an idea, or something that you wish worked
differently, feel free to open an [issue][issues] if it seems like
nobody already has.

## Maintainers

Beat Link Trigger is primarily maintained by [@brunchboy][brunchboy].

## License

<a href="http://deepsymmetry.org"><img align="right" alt="Deep Symmetry"
 src="doc/assets/DS-logo-bw-200-padded-left.png" width="216" height="123"></a>

Copyright © 2016&ndash;2018 [Deep Symmetry, LLC](http://deepsymmetry.org)

Distributed under the
[Eclipse Public License 1.0](http://opensource.org/licenses/eclipse-1.0.php).
By using this software in any fashion, you are agreeing to be bound by
the terms of this license. You must not remove this notice, or any
other, from this software.


[contributions-released]: https://help.github.com/articles/github-terms-of-service/#6-contributions-under-repository-license
[covenant]: http://contributor-covenant.org/
[clojure]: https://clojure.org
[leiningen]: https://leiningen.org
[emacs]: https://www.gnu.org/software/emacs/
[cider]: http://www.cider.mx/en/latest/
[idea]: https://www.jetbrains.com/idea/
[cursive]: https://cursive-ide.com
[switch]: https://smile.amazon.com/gp/product/B00HGLVZLY/
[pulls]: https://github.com/Deep-Symmetry/beat-link-trigger/pulls
[issues]: https://github.com/Deep-Symmetry/beat-link-trigger/issues
[brunchboy]: https://github.com/brunchboy
