# How to Build
1. Install **[GitHub for Mac](https://mac.github.com/)** then **[fork and clone our repository](https://guides.github.com/activities/forking/)**. 
   To use Git from the Terminal, see the [Setting up Git](https://help.github.com/articles/set-up-git/) and [Fork a Repo](https://help.github.com/articles/fork-a-repo/) articles.
   If you'd rather not use Git, use the 'Download ZIP' button on the right to get the source directly.

1. As this is an IntelliJ project, you'd better install the latest version of [IntelliJ IDEA](https://www.jetbrains.com/idea/), community version is enough.

1. Start IntelliJ Idea. Select [File] -> [Open], then locate to the java-tron folder which you have git cloned to your local drive. Then click [Open] button on the right bottom.

1. Check on [Use auto-import] on the [Import Project from Gradle] dialog. Select JDK 1.8 in the [Gradle JVM] option. Then click [OK].

1. IntelliJ will open the project and start gradle syncing, which will take several minutes, depending on your network connection. After that, select [Gradle] -> [Tasks] -> [build], and then double click [build] option.  The project will start building, which will normally take less than one minute to finish.

# How to Run
## run as a full node
1. After the building finishes, locate "FullNode" in the project structure view panel, which is on the path "java-tron/src/main/java/org.tron/program/FullNode". Select "FullNode", right click on it, and select "Run 'FullNode.main()'", then "FullNode" starts running.

## run as a witness node
