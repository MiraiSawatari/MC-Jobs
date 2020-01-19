package com.dmgkz.mcjobs.scheduler;

import java.text.DecimalFormat;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Iterator;
import java.util.List;

=======
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


>>>>>>> origin3/master
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.dmgkz.mcjobs.McJobs;
import com.dmgkz.mcjobs.localization.GetLanguage;
import com.dmgkz.mcjobs.playerdata.PlayerCache;
import com.dmgkz.mcjobs.prettytext.PrettyText;
import com.dmgkz.mcjobs.util.TimeFormat;


public class McJobsNotify implements Runnable {
	private GetLanguage modText = McJobs.getPlugin().getLanguage();
	private static int timer;
	private static boolean bShow = false;
<<<<<<< HEAD

	public static void setTime(int time){
		timer = time;
	}

	public static void setShow(boolean b){
		bShow = b;
	}

	@Override
	public void run() {
//		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
=======
	
	public static void setTime(int time){
		timer = time;
	}
	
	public static void setShow(boolean b){
		bShow = b;
	}
	
	@Override
	public void run() {
//		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();		
>>>>>>> origin3/master
//		console.sendMessage(ChatColor.GREEN + "Sending money earned messages.");

		List<Player> players = new ArrayList<Player>();
		String time = TimeFormat.getFormatedTime(timer);

<<<<<<< HEAD
		players = (List<Player>) Bukkit.getServer().getOnlinePlayers();
=======
		players = (List<Player>) Arrays.asList(Bukkit.getServer().getOnlinePlayers());
>>>>>>> origin3/master

		Iterator<Player> it = players.iterator();
			while(it.hasNext()){
				Player play = it.next();
<<<<<<< HEAD
				double earned = PlayerCache.getEarnedIncome(play.getName());
=======
				double earned = PlayerCache.getEarnedIncome(play.getName());			
>>>>>>> origin3/master

				if(earned != 0D){
					DecimalFormat df = new DecimalFormat("###,###,###.##");
					String sEarned = "";
<<<<<<< HEAD

					sEarned = df.format(earned);

					String str = ChatColor.GREEN + modText.getJobNotify("message").addVariables(sEarned, play.getName(), time);
					PrettyText text = new PrettyText();

					if(bShow)
						text.formatPlayerText(str, play);
=======
					
					sEarned = df.format(earned);
					
					String str = ChatColor.GREEN + modText.getJobNotify("message").addVariables(sEarned, play.getName(), time);
					PrettyText text = new PrettyText();
					
					if(bShow)
						text.formatPlayerText(str, play);			
>>>>>>> origin3/master
					PlayerCache.setEarnedIncome(play.getName(), 0D);
					PlayerCache.savePlayerCache(play.getName());
				}
			}
	}
}
