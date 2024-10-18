Git Operations
==============


Git Repo -> Staging Area + Commit Folder

Turn a directory into git repository or make directory managed by git.

.. code-block:: bash

    git init

To explore our commit history with git log. To exit this menu, please press "q" and confirm this with Enter on your keyboard.

.. code-block:: bash

    git log

To Switch to specific commit

.. code-block:: bash

    # shows the commit history
    git log

    # take a commit id from the logs and use in the below command.
    git checkout <commit_id>

    # to switch back to branch
    git checkout master

Deleting working directory files

.. code-block:: bash

    # this command deletes the file and stages for commit.
    # this equal to (manual delete + git add )
    git rm <files/folder>

Undoing or revert unstaged changes

.. code-block:: bash

    # to undo perticular file
    git checkout <file>
    # recommanded
    git restore <file>

    # to undo all changes which are unstaged
    git checkout .
    # recommanded
    git restore .

Delete untracked files

.. code-block:: bash

    # this lists all files which are untracked and picked up for delete
    # flags: d delete, n list
    git clean -dn

    # this deletes all untracked files
    # flags: d delete, f force
    git clean -df

Undoing or reverting staged changes

.. code-block:: bash

    # unstage single or all files
    git reset <file>
    git reset .

    # revert a file or all files
    git restore <file>
    git restore .

Deleting or undo commits with git reset

.. code-block:: bash

    # delete last one commit and stay changes in staged area
    git reset --soft HEAD~1

    # delete last commit and remove all files permanently
    git reset --hard HEAD~1


Commmands to see which are files are tracking by git

.. code-block:: bash

    git ls-files

Deleting a branch

.. code-block:: bash

    # only if it has already been fully merged into its upstream branch
    git branch -d <branch>

    # force deletes the branch, regardless of its merge status
    git branch -D <branch-name> [<branch-name>]


Committing detached HEAD changes

.. code-block:: bash

    git log
    # checkout to any commit
    git checkout <commit-hash>

    # do some changes
    git add .
    git commit -m 'commit message'

    # you are in detached head
    git branch 
    # create a new branch for detached head
    git branch detached-head

    git switch master

    git merge detached-head

    git branch -D detached-head


1. `git status` is used to list all new or modified files that haven't yet been committed

.. code-block:: bash

    git status


2. `git add <file-name>` to update what will be committed or staged

.. code-block:: bash

    # stage a single file, or multile files by separating file names by comma
    git add <file-name>
    git add <file1>,<file2>

    # stage all changes at once shot
    git add *

Unstage staged files

.. code-block:: bash

    # unstage single file
    git restore --staged <file>

    # unstage all files
    git restore --staged .


3. `git commit -m "write commit message"` is used to commit changes

.. code-block:: bash

    git commit -m "write commit message"


4. `git push origin main` is used to push the project to GitHub main branch

.. code-block:: bash

    git push origin main


5. `git branch` shows branches present in this repository and also we can see which is the active branch indicated by asterisk.

.. code-block:: bash

    git branch


6. `git clone <url> <new-folder-name>` used to clone the project

.. code-block:: bash

    # clone master branch to local
    git clone <url> <new-folder-name>

    # clone a perticular branch to local
    git clone -b <branch> <repo-url> <new-folder-name>


7. `git branch <new-branch-name>` used to create new branch

.. code-block:: bash

    git branch <new-branch-name>


8. `git checkout <branch-name>` used to switch from one branch to another branch

.. code-block:: bash

    # switch to existing branch
    git checkout <branch-name>

    # Aletrnative
    git switch <branch-name>

    # create new branch and switch to it
    git checkout -b <branch-name>

    # Aletrnative
    git switch -c <branch-name>
    

9.  `git diff` compare the changes

.. code-block:: bash

    git diff

10.  Use git stash when you want to record the current state of the working directory and the index, but want to go back to a clean working directory.
    https://git-scm.com/docs/git-stash

.. code-block:: bash

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
