package com.dmgkz.mcjobs.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

<<<<<<< HEAD
=======
import net.milkbowl.vault.permission.Permission;

>>>>>>> origin3/master
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.dmgkz.mcjobs.McJobs;
import com.dmgkz.mcjobs.localization.GetLanguage;
import com.dmgkz.mcjobs.playerdata.PlayerCache;
import com.dmgkz.mcjobs.playerjobs.PlayerJobs;
import com.dmgkz.mcjobs.playerjobs.levels.Leveler;
import com.dmgkz.mcjobs.prettytext.PrettyText;
import com.dmgkz.mcjobs.scheduler.McJobsFilePrune;
import com.dmgkz.mcjobs.scheduler.McJobsPreComp;
import com.dmgkz.mcjobs.scheduler.McJobsRemovePerm;
import com.dmgkz.mcjobs.util.StringToNumber;

<<<<<<< HEAD
import net.milkbowl.vault.permission.Permission;

public class AdminCommand implements CommandExecutor{

	private static boolean bVault = false;

=======
public class AdminCommand implements CommandExecutor{

	private static boolean bVault = false;
	
>>>>>>> origin3/master
	private McJobs mcPlugin;
	private GetLanguage modText = McJobs.getPlugin().getLanguage();
	private PrettyText text = new PrettyText();
	private String str;
<<<<<<< HEAD

=======
	
>>>>>>> origin3/master
	public AdminCommand(McJobs plugin) {
		this.mcPlugin = plugin;
	}


	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(!command.getName().equalsIgnoreCase("mcjobsadmin")){
			sender.sendMessage("Critical failure!");
			return true;
		}
		Player playsend = null;
<<<<<<< HEAD

=======
		
>>>>>>> origin3/master
		if(sender instanceof Player){
			playsend = (Player) sender;
			if(!playsend.hasPermission("mcjobs.admin")){
				str = ChatColor.RED + modText.getAdminCommand("permission").addVariables("", playsend.getName(), label);
				text.formatPlayerText(str, playsend);
				return true;
			}
		}
<<<<<<< HEAD

		if(args.length == 0){
			String version = mcPlugin.getDescription().getVersion();
			sender.sendMessage(ChatColor.DARK_RED + "MC Jobs by " + ChatColor.GOLD + "RathelmMC v" + ChatColor.GREEN + version);
			return false;
=======
		
		if(args.length == 0){
			String version = mcPlugin.getDescription().getVersion();
			sender.sendMessage(ChatColor.DARK_RED + "MC Jobs by " + ChatColor.GOLD + "RathelmMC v" + ChatColor.GREEN + version);
			return false;				
>>>>>>> origin3/master
		}
		else if(args[0].equalsIgnoreCase("reload") && args.length == 1){
			sender.getServer().getPluginManager().getPlugin(mcPlugin.getName()).reloadConfig();

			PlayerJobs.getJobsList().clear();
			Leveler.getRanks().clear();
<<<<<<< HEAD

=======
			
>>>>>>> origin3/master
			McJobs.getPlugin().getServer().getScheduler().cancelTasks(McJobs.getPlugin());

			try{
				mcPlugin.mcloadconf(mcPlugin);
			}
			catch(Exception e){
				if(sender instanceof Player){
					str = ChatColor.RED + modText.getAdminCommand("failedreload").addVariables("", sender.getName(), label);
					text.formatPlayerText(str, (Player) sender);
				}
				else
					sender.sendMessage(ChatColor.RED + modText.getAdminCommand("failedreload").addVariables("", sender.getName(), label));
			}
<<<<<<< HEAD

			PlayerCache.loadPlayerPerms();

			Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(mcPlugin, new McJobsRemovePerm(), 1200L, 1200L);
			Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(mcPlugin, new McJobsPreComp(), 200L, 200L);

			if(mcPlugin.isPrune())
				Bukkit.getServer().getScheduler().scheduleAsyncRepeatingTask(mcPlugin, new McJobsFilePrune(), 1200L, 1200L);

=======
			
			PlayerCache.loadPlayerPerms();
			
			Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(mcPlugin, new McJobsRemovePerm(), 1200L, 1200L);
			Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(mcPlugin, new McJobsPreComp(), 200L, 200L);
			
			if(mcPlugin.isPrune())
				Bukkit.getServer().getScheduler().scheduleAsyncRepeatingTask(mcPlugin, new McJobsFilePrune(), 1200L, 1200L);
			
>>>>>>> origin3/master
			if(sender instanceof Player){
				str = ChatColor.GRAY + modText.getAdminCommand("succeedreload").addVariables("", sender.getName(), label);
				text.formatPlayerText(str, (Player) sender);
			}
			else
				sender.sendMessage(ChatColor.GRAY + modText.getAdminCommand("succeedreload").addVariables("", sender.getName(), label));

			return true;
		}
		else if(args[0].equalsIgnoreCase("defaults") && args.length == 1){
			if(playsend != null){
				if(!playsend.hasPermission("mcjobs.admin.defaults")){
					str = ChatColor.RED + modText.getAdminCommand("permission").addVariables("", playsend.getName(), label);
					text.formatPlayerText(str, playsend);
					return true;
<<<<<<< HEAD
				}
=======
				}						
>>>>>>> origin3/master
			}
			sender.getServer().getPluginManager().getPlugin(mcPlugin.getName()).getConfig().options().copyDefaults(true);
			mcPlugin.saveConfig();

			if(sender instanceof Player){
				str = ChatColor.GRAY + modText.getAdminCommand("defaults").addVariables("", sender.getName(), label);
				text.formatPlayerText(str, (Player) sender);
			}
			else
				sender.sendMessage(ChatColor.GRAY + modText.getAdminCommand("defaults").addVariables("", sender.getName(), label));
			return true;
		}
<<<<<<< HEAD

=======
		
>>>>>>> origin3/master
		else if(args[0].equalsIgnoreCase("addlevel")){
			if(args.length != 4){
				if(sender instanceof Player){
					str = ChatColor.RED + modText.getAdminAdd("args").addVariables("", sender.getName(), label);
<<<<<<< HEAD
					text.formatPlayerText(str, (Player) sender);
=======
					text.formatPlayerText(str, (Player) sender);					
>>>>>>> origin3/master
				}
				else
					sender.sendMessage(ChatColor.RED + modText.getAdminAdd("args").addVariables("", sender.getName(), label));
				return true;
			}
<<<<<<< HEAD

=======
			
>>>>>>> origin3/master
			if(!getPlayers(args[1], sender).isEmpty()){
				this.addLevels(getPlayers(args[1], sender), args[2], args[3], sender);
			}

			return true;
		}
<<<<<<< HEAD

=======
		
>>>>>>> origin3/master
		else if(args[0].equalsIgnoreCase("addxp")){
			if(args.length != 4){
				if(sender instanceof Player){
					str = ChatColor.RED + modText.getAdminAdd("args").addVariables("", sender.getName(), label);
<<<<<<< HEAD
					text.formatPlayerText(str, (Player) sender);
=======
					text.formatPlayerText(str, (Player) sender);					
>>>>>>> origin3/master
				}
				else
					sender.sendMessage(ChatColor.RED + modText.getAdminAdd("args").addVariables("", sender.getName(), label));
				return true;
			}
<<<<<<< HEAD

=======
			
>>>>>>> origin3/master
			if(!getPlayers(args[1], sender).isEmpty()){
				this.addExp(getPlayers(args[1], sender), args[2], args[3], sender);
			}

			return true;
		}
<<<<<<< HEAD

=======
		
>>>>>>> origin3/master
		else if(args[0].equalsIgnoreCase("add")){
			if(args.length != 3){
				if(sender instanceof Player){
					str = ChatColor.RED + modText.getAdminAdd("args").addVariables("", sender.getName(), label);
					text.formatPlayerText(str, (Player) sender);
				}
				else
					sender.sendMessage(ChatColor.RED + modText.getAdminAdd("args").addVariables("", sender.getName(), label));
				return true;
			}
<<<<<<< HEAD

			if(!getPlayers(args[1], sender).isEmpty()){
				this.addJob(getPlayers(args[1], sender), args[2], sender);
			}

			return true;
		}
=======
						
			if(!getPlayers(args[1], sender).isEmpty()){			
				this.addJob(getPlayers(args[1], sender), args[2], sender);
			}
				
			return true;
		}				
>>>>>>> origin3/master

		else if(args[0].equalsIgnoreCase("remove")){
			if(args.length != 3){
				if(sender instanceof Player){
					str = ChatColor.RED + modText.getAdminRemove("args").addVariables("", sender.getName(), label);
					text.formatPlayerText(str, (Player) sender);
				}
				else
					sender.sendMessage(ChatColor.RED + modText.getAdminRemove("args").addVariables("", sender.getName(), label));
				return true;
			}

<<<<<<< HEAD
			if(!getPlayers(args[1], sender).isEmpty()){
				this.removeJob(getPlayers(args[1], sender), args[2], sender);
			}

			return true;
		}

		else if(args[0].equalsIgnoreCase("list")){
=======
			if(!getPlayers(args[1], sender).isEmpty()){			
				this.removeJob(getPlayers(args[1], sender), args[2], sender);
			}
		
			return true;
		}

		else if(args[0].equalsIgnoreCase("list")){			
>>>>>>> origin3/master
			if(args.length != 2 && args.length != 3){
				sender.sendMessage(modText.getAdminList("args").addVariables("", sender.getName(), ""));
				return true;
			}
<<<<<<< HEAD

=======
			
>>>>>>> origin3/master
			ArrayList<String> players = new ArrayList<String>();
			Integer pageNum;
			String[] sList;
			Player play = null;
<<<<<<< HEAD

			if(sender instanceof Player)
				play = (Player)sender;

=======
			
			if(sender instanceof Player)
				play = (Player)sender;
			
>>>>>>> origin3/master
			if(args.length == 2){
				pageNum = 1;
			}
			else{
				if(StringToNumber.isPositiveNumber(args[2]))
					pageNum = Integer.parseInt(args[2]);
				else{
					if(sender instanceof Player){
						String s;
						PrettyText t = new PrettyText();
						s = modText.getAdminList("wrongpage").addVariables("", sender.getName(), args[2]);
						t.formatPlayerText(s, play);
					}
					else
						sender.sendMessage(modText.getAdminList("wrongpage").addVariables("", sender.getName(), args[2]));
<<<<<<< HEAD

					pageNum = 1;
				}
			}

			players = getPlayers(args[1], sender);

			if(!players.isEmpty()){

				sList = showList(players, pageNum);

				PrettyText text = new PrettyText();
				for(String s : sList){
					if(play != null){
						text.formatPlayerText(s, play);
=======
					
					pageNum = 1;
				}
			}
			
			players = getPlayers(args[1], sender);
			
			if(!players.isEmpty()){
				
				sList = showList(players, pageNum);
				
				PrettyText text = new PrettyText();
				for(String s : sList){
					if(play != null){
						text.formatPlayerText(s, play); 
>>>>>>> origin3/master
					}
					else{
						sender.sendMessage(s);
					}
				}
			}
			return true;
		}
<<<<<<< HEAD

=======
		
>>>>>>> origin3/master
		else if(args.length > 3){
			if(sender instanceof Player){
				str = ChatColor.RED + modText.getAdminCommand("args").addVariables("", sender.getName(), label);
				text.formatPlayerText(str, (Player) sender);
			}
			else
				sender.sendMessage(ChatColor.RED + modText.getAdminCommand("args").addVariables("", sender.getName(), label));
			return true;
		}
<<<<<<< HEAD

		return false;
	}

	private void addLevels(ArrayList<String> players, String job, String level, CommandSender sender){
		job = job.toLowerCase();
		int levels = 1;

		if(StringToNumber.isPositiveNumber(level))
			levels = Integer.parseInt(level);

=======
		
		return false;
	}
	
	private void addLevels(ArrayList<String> players, String job, String level, CommandSender sender){
		job = job.toLowerCase();
		int levels = 1;
		
		if(StringToNumber.isPositiveNumber(level))
			levels = Integer.parseInt(level);
		
>>>>>>> origin3/master
		if(PlayerJobs.getJobsList().get(job) == null){
			sender.sendMessage(ChatColor.RED + modText.getAdminCommand("exist").addVariables(job, "", sender.getName()));
			return;
		}
		else{
			Iterator<String> it = players.iterator();
<<<<<<< HEAD

			while(it.hasNext()){
				String play = it.next();

=======
			
			while(it.hasNext()){
				String play = it.next();
				
>>>>>>> origin3/master
				if(play == null){
					sender.sendMessage(ChatColor.RED + modText.getAdminAdd("offline").addVariables(job, "", sender.getName()));
					return;
				}
<<<<<<< HEAD

=======
				
>>>>>>> origin3/master
				if(!PlayerCache.hasJob(play, job)){
					sender.sendMessage(ChatColor.RED + modText.getExperience("nojob").addVariables(job, play, level));
					continue;
				}
<<<<<<< HEAD

				if(PlayerCache.addLevels(play, job, levels)){
					sender.sendMessage(ChatColor.GRAY + modText.getExperience("added_lvl").addVariables(job, play, level));

=======
				
				if(PlayerCache.addLevels(play, job, levels)){
					sender.sendMessage(ChatColor.GRAY + modText.getExperience("added_lvl").addVariables(job, play, level));
					
>>>>>>> origin3/master
					if(Bukkit.getPlayer(play) != null){
						PrettyText text = new PrettyText();
						String str = ChatColor.GRAY + modText.getExperience("padded_lvl").addVariables(job, play, level);
						text.formatPlayerText(str, Bukkit.getPlayer(play));
<<<<<<< HEAD
					}
=======
					}					
>>>>>>> origin3/master
				}
			}
		}
	}

	private void addExp(ArrayList<String> players, String job, String level, CommandSender sender){
		job = job.toLowerCase();
		double experience = 1;
<<<<<<< HEAD

		if(StringToNumber.isPositiveNumber(level))
			experience = Double.parseDouble(level);

=======
		
		if(StringToNumber.isPositiveNumber(level))
			experience = Double.parseDouble(level);
		
>>>>>>> origin3/master
		if(PlayerJobs.getJobsList().get(job) == null){
			sender.sendMessage(ChatColor.RED + modText.getAdminCommand("exist").addVariables(job, "", sender.getName()));
			return;
		}
		else{
			Iterator<String> it = players.iterator();
<<<<<<< HEAD

			while(it.hasNext()){
				String play = it.next();

=======
			
			while(it.hasNext()){
				String play = it.next();
				
>>>>>>> origin3/master
				if(play == null){
					sender.sendMessage(ChatColor.RED + modText.getAdminAdd("offline").addVariables(job, "", sender.getName()));
					return;
				}

				if(!PlayerCache.hasJob(play, job)){
					sender.sendMessage(ChatColor.RED + modText.getExperience("nojob").addVariables(job, play, level));
					continue;
				}

				if(PlayerCache.addExp(play, job, experience)){
					sender.sendMessage(ChatColor.GRAY + modText.getExperience("added_xp").addVariables(job, play, level));
<<<<<<< HEAD

=======
					
>>>>>>> origin3/master
					if(Bukkit.getPlayer(play) != null){
						PrettyText text = new PrettyText();
						String str = ChatColor.GRAY + modText.getExperience("padded_xp").addVariables(job, play, level);
						text.formatPlayerText(str, Bukkit.getPlayer(play));
<<<<<<< HEAD
					}
=======
					}					
>>>>>>> origin3/master
				}
			}
		}
	}

	private void addJob(ArrayList<String> players, String job, CommandSender sender){
		job = job.toLowerCase();
<<<<<<< HEAD

=======
		
>>>>>>> origin3/master
		if(PlayerJobs.getJobsList().get(job) == null){
			sender.sendMessage(ChatColor.RED + modText.getAdminCommand("exist").addVariables(job, "", sender.getName()));
			return;
		}
		else{
			Iterator<String> it = players.iterator();
<<<<<<< HEAD

			while(it.hasNext()){
				String play = it.next();

=======
			
			while(it.hasNext()){
				String play = it.next();
				
>>>>>>> origin3/master
				if(play == null){
					sender.sendMessage(ChatColor.RED + modText.getAdminAdd("offline").addVariables(job, "", sender.getName()));
					return;
				}
<<<<<<< HEAD

				if(PlayerCache.hasJob(play, job)){
					sender.sendMessage(ChatColor.GRAY + modText.getAdminAdd("hasjob").addVariables(job, play, sender.getName()));
				}
				else{
					PlayerCache.addJob(play, job);

					sender.sendMessage(ChatColor.GRAY + modText.getAdminAdd("added").addVariables(job, play, sender.getName()));

=======
				
				if(PlayerCache.hasJob(play, job)){
					sender.sendMessage(ChatColor.GRAY + modText.getAdminAdd("hasjob").addVariables(job, play, sender.getName()));
				}
				else{				
					PlayerCache.addJob(play, job);

					sender.sendMessage(ChatColor.GRAY + modText.getAdminAdd("added").addVariables(job, play, sender.getName()));
					
>>>>>>> origin3/master
					if(Bukkit.getPlayer(play) != null){
						PrettyText text = new PrettyText();
						String str = ChatColor.GRAY + modText.getAdminAdd("padded").addVariables(job, play, sender.getName());
						text.formatPlayerText(str, Bukkit.getPlayer(play));
					}
				}
			}
		}
	}

	private void removeJob(ArrayList<String> players, String job, CommandSender sender){
		job = job.toLowerCase();
		Iterator<String> it = players.iterator();

		if(PlayerJobs.getJobsList().get(job) == null){
			sender.sendMessage(ChatColor.RED + modText.getAdminCommand("exist").addVariables(job, sender.getName(), ""));
			return;
		}

		if(sender instanceof Player){
			if(PlayerJobs.getJobsList().get(job).getData().compJob().isDefault() && !sender.hasPermission("mcjobs.admin.leavedefault")){
				PrettyText t = new PrettyText();
				String s = ChatColor.RED + modText.getAdminRemove("nodefault").addVariables(job, sender.getName(), "");
				t.formatPlayerText(s, (Player)sender);
				return;
<<<<<<< HEAD
			}
		}

=======
			}				
		}
		
>>>>>>> origin3/master
		while(it.hasNext()){
			String play = it.next();

			if(play == null){
				sender.sendMessage(ChatColor.RED + modText.getAdminAdd("offline").addVariables(job, "", sender.getName()));
				return;
			}

			if(!PlayerCache.hasJob(play, job)){
				sender.sendMessage(ChatColor.RED + modText.getAdminRemove("nojob").addVariables(job, play, sender.getName()));
			}
			else{
				PlayerCache.removeJob(play, job);
<<<<<<< HEAD

=======
				
>>>>>>> origin3/master
				sender.sendMessage(ChatColor.GRAY + modText.getAdminRemove("removed").addVariables(job, play, sender.getName()));

				if(Bukkit.getPlayer(play) != null){
					PrettyText text = new PrettyText();
					String str = ChatColor.GRAY + modText.getAdminRemove("premoved").addVariables(job, play, sender.getName());
					text.formatPlayerText(str, Bukkit.getPlayer(play));
				}
			}
<<<<<<< HEAD
		}
=======
		}					
>>>>>>> origin3/master
	}

	private String[] showList(ArrayList<String> players, Integer pageNum){
		Iterator<String> it = players.iterator();
		String[] str = new String[players.size()];
		String[] modStr;
		Integer i = 0;

<<<<<<< HEAD

		while(it.hasNext()){
			String play = it.next();
			String playJobList = "";

			Iterator<Map.Entry<String, PlayerJobs>> its = PlayerJobs.getJobsList().entrySet().iterator();
			while(its.hasNext()){
				Map.Entry<String, PlayerJobs> pair = its.next();

=======
		
		while(it.hasNext()){
			String play = it.next();
			String playJobList = "";
			
			Iterator<Map.Entry<String, PlayerJobs>> its = PlayerJobs.getJobsList().entrySet().iterator();
			while(its.hasNext()){
				Map.Entry<String, PlayerJobs> pair = its.next();
					
>>>>>>> origin3/master
				if(PlayerCache.hasJob(play, pair.getKey())){
					playJobList = playJobList.concat(" " + ChatColor.GOLD + pair.getKey() + ChatColor.GRAY + ",");
				}
			}
			if(playJobList.isEmpty())
				playJobList = modText.getAdminList("nojobs").addVariables("", play, "");
			else{
				playJobList = playJobList.substring(0, (playJobList.length() - 1));
				playJobList = playJobList.concat(".");
			}
<<<<<<< HEAD

			str[i] = modText.getAdminList("playerlist").addVariables("", play, playJobList);
			i++;
		}

		Integer iLength = str.length;
		Integer allowedPages = 1;
		Integer page = pageNum;

		while(iLength > 10){
			iLength = iLength - 10;
			allowedPages++;
		}

		if(page > allowedPages)
			page = 1;

=======
			
			str[i] = modText.getAdminList("playerlist").addVariables("", play, playJobList);
			i++;
		}
		
		Integer iLength = str.length;
		Integer allowedPages = 1;
		Integer page = pageNum;
			
		while(iLength > 10){ 
			iLength = iLength - 10;
			allowedPages++;
		}
		
		if(page > allowedPages)
			page = 1;
		
>>>>>>> origin3/master
		modStr = new String[iLength];
		for(int x = 0 ; x < modStr.length ; x++){
			modStr[x] = str[(10 * (page - 1)) + x];
		}
<<<<<<< HEAD

=======
		
>>>>>>> origin3/master
		return str;
	}

	private ArrayList<String> getPlayers(String args, CommandSender sender){
		List<Player> aOnline              = new ArrayList<Player>();
		ArrayList<String> players         = new ArrayList<String>();

<<<<<<< HEAD
		aOnline = (List<Player>) Bukkit.getOnlinePlayers();

		if(PlayerCache.playerExists(args))
			players.add(args);

=======
		aOnline = (List<Player>) Arrays.asList(Bukkit.getOnlinePlayers());			

		if(PlayerCache.playerExists(args))
			players.add(args);
				
>>>>>>> origin3/master
		if(bVault){
			Permission permission = Bukkit.getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class).getProvider();
			List<String> lGroups = new ArrayList<String>();
			lGroups = Arrays.asList(permission.getGroups());
<<<<<<< HEAD

=======
			
>>>>>>> origin3/master
			if(lGroups.contains(args)){
				Iterator<Player> it = aOnline.iterator();

				while(it.hasNext()){
					Player play = it.next();
					String[] playerGroups = permission.getPlayerGroups(play);
					List<String> lPlayerGroups = new ArrayList<String>();
<<<<<<< HEAD

					if(playerGroups != null){
						lPlayerGroups = Arrays.asList(playerGroups);

=======
					
					if(playerGroups != null){
						lPlayerGroups = Arrays.asList(playerGroups);
					
>>>>>>> origin3/master
						if(lPlayerGroups.contains(args))
							players.add(play.getName());
					}
				}

				if(players.isEmpty()){
					sender.sendMessage(ChatColor.GRAY + modText.getAdminAdd("empty").addVariables("", args, sender.getName()));
					return players;
				}
			}

			if(players.isEmpty()){
				sender.sendMessage(ChatColor.GRAY + modText.getAdminAdd("offline").addVariables("", args, sender.getName()));
				return players;
			}
		}
<<<<<<< HEAD

=======
		
>>>>>>> origin3/master
		if(players.isEmpty()){
			sender.sendMessage(ChatColor.RED + modText.getAdminAdd("novault").addVariables("", args, sender.getName()));
			return players;
		}

		return players;
	}

	public static void setVault(boolean b){
		bVault = b;
<<<<<<< HEAD
	}
=======
	}	
>>>>>>> origin3/master
}
