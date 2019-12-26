# Backend Interview Problems

This directory contains two sets of problems in two subdirectores called
`json-manipulation` and `mystery-duplicates`. Each contains its own `README.md`
file which explain a set of `TASK`s you need to complete.

Fork this repo and complete all of the `TASK`s described in the subproject
`README.md` files, so we can see your solutions and git usage.

## Running the sub-projects

You can either invoke gradle directly by doing `gradle :mystery-duplicates:run`
or `gradle :json-manipuation:run` on the command line, or you can open this
directory in intellij and do either sub-project's `run` task from there. Both
sub-projects have shared run configurations so they should appear automatically
in the dropdown on the top right of the project window, by the build and run
icons.

#### Please Note:

This repo is configured to use IntelliJ as it's an industry standard but you're
not required to have or use any monolithic IDE. Gradle, which is a free,
multiplatform command line build tool, will run everything just fine as
described in previous paragraphs.

Whatever you're comfortable with, so long as the code works: nothing presented
here is meant as a "trick."

If you choose not to use an IDE, you'll need java12 installed _as well as_
gradle 6 command line tool. On OS X you can do that by running
`brew install gradle`. Just remember that you can download intellij community
edition for free from https://www.jetbrains.com/idea/download/

## Hints

- Check `ai.brace.EmployeeProcessor` in the mystery-duplicates project for an
example of how to load the lines of a text file from the `resources` directory.
- Google's GSON library is already included as a dependency in the root
`build.gradle` file's description of the `json-manipulation` sub-project. It
should automatically resolve when imported properly in that project.
