#!/bin/sh
# Copy this to the {POKY}/build/ folder
strace -o /tmp/log tmp/work/x86_64-linux/qemu-helper-native/1.0-r1/recipe-sysroot-native/usr/bin//qemu-system-i386
want_file=`grep qemu-helper-native /tmp/log|tail -n 1|sed -e "s/open(\"\(.*\)\",.*)/\1/g"`
echo $want_file
basename_want_file=`basename $want_file`
echo $basename_want_file
dirname_want_file=`dirname $want_file`
echo $dirname_want_file
cd $dirname_want_file
real_want_file=`find . -name "$basename_want_file"*`
echo $real_want_file
if [ -z $real_want_file ]
then
	exit
else
pwd
echo $real
ln -s $real_want_file $basename_want_file
fi
