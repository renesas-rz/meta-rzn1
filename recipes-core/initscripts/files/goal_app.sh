#!/bin/sh

LD_LIBRARY_PATH=/home/root
export LD_LIBRARY_PATH

if [ -z "`cat /proc/cmdline | grep GOAL_APPL_LINUX_PREV`" ]
then
	if [ ! -f /home/root/goal_rzn_a7_demo_board.bin ]; then
		echo "No GOAL application found"
		exit 0
	fi

	case "$1" in
		start)
			echo -n "Starting goal_rzn_a7_demo_board.bin application"
			# usb0 is already brought up by /etc/init.d/networking
			#ifup usb0
			/home/root/goal_rzn_a7_demo_board.bin -i usb0 &
			sleep 2
			;;
        
		stop)
			killall goal_rzn_a7_demo_board.bin
			;;

		restart|reload)
			$0 stop
			$0 start
			;;
		*)
			echo "Usage: $0 {start|stop|restart}"
			exit 1
			;;
	esac
else
	echo -n "Starting GOAL application has been prevent by boot arg GOAL_APPL_LINUX_PREV"
fi
