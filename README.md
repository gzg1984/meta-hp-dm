---
First of ALL: 

If your are in "THE OTHER COUNTRY", you cannot directly download any Yocto Project.

Suggestion in above case: 

Buy a VPS.
---
* Get Start

   Follow this link:
   
   [Quick Start](http://www.yoctoproject.org/docs/2.3/yocto-project-qs/yocto-project-qs.html)

   Following links show something different, but better read them later:

   [mega-manual](http://www.yoctoproject.org/docs/2.3/mega-manual/mega-manual.html)
   
   [fishriver](https://wiki.yoctoproject.org/wiki/Transcript:_from_git_checkout_to_meta-intel_BSP)

* After download

   . oe-init-build-env
   
   Then follow the notes to run bitbake.

* If you are in "The Other Country"

	Download and run "bitbake" , wait to end, and then use rsync to download the whole folder to your local server.

* If runqemu fails

	Copy qemu_fail.sh to the build folder and try to run it. This shell will try to fix the runqemu problem

* Add this layer to the Poky project
	
	First of All: Check the current layers
---
	bitbake show-layers
---
	Then download this layer to the poky home folder, same as other meta-* with the folder name meta-hp-dm
---
	bitbake add-layer meta-hp-dm
---
	Then check show-layers again and see the new layer at the end of the output







