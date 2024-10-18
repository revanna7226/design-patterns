Git commands
============

Turn a directory into git repository or make directory managed by git.

.. code-block:: sh

    git init


1. `git status` is used to list all new or modified files that haven't yet been committed

.. code-block:: sh

    git status


2. `git add <file-name>` to update what will be committed or staged

.. code-block:: sh

    # stage a single file, or multile files by separating file names by comma
    git add <file-name>
    git add <file1>,<file2>

    # stage all changes at once shot
    git add *


3. `git commit -m "write commit message"` is used to commit changes

.. code-block:: sh

    git commit -m "write commit message"


4. `git push origin main` is used to push the project to GitHub main branch

.. code-block:: sh

    git push origin main


5. `git branch` shows branches present in this repository

.. code-block:: sh

    git branch


6. `git clone <url> <new-folder-name>` used to clone the project

.. code-block:: sh

    # clone master branch to local
    git clone <url> <new-folder-name>

    # clone a perticular branch to local
    git clone -b <branch> <repo-url> <new-folder-name>


7. `git branch <new-branch-name>` used to create new branch

.. code-block:: sh

    git branch <new-branch-name>


8. `git checkout <branch-name>` used to switch from one branch to another branch

.. code-block:: sh

    # switch to existing branch
    git checkout <branch-name>

    # create new branch and switch to it
    git checkout -b <branch-name>


9.  `git diff` compare the changes

.. code-block:: sh

    git diff

10.  Use git stash when you want to record the current state of the working directory and the index, but want to go back to a clean working directory.
    https://git-scm.com/docs/git-stash

.. code-block:: sh

    # push the intermediate changes with index reference
    git stash

    # push the intermediate changes with a message
    git stash push -m "message to temp save"

    # to check for all the stashes
    git stash list

    # to load a perticular changes use index to load
    git stash apply <stash-index>

    # to remove a stash with an index
    git stash drop <stash-index>

    # need to check what is it
    git stash clear
