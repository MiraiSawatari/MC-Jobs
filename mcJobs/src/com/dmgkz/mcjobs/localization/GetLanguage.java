package com.dmgkz.mcjobs.localization;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
<<<<<<< HEAD
import java.io.InputStreamReader;
=======
>>>>>>> origin3/master

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.dmgkz.mcjobs.McJobs;
import com.dmgkz.mcjobs.prettytext.AddTextVariables;
import com.dmgkz.mcjobs.prettytext.PrettyText;

public class GetLanguage {
	private McJobs plugin;
<<<<<<< HEAD

	private FileConfiguration fcLocal;
	private File              dLocal;

=======
	
	private FileConfiguration fcLocal;
	private File              dLocal;
	
>>>>>>> origin3/master
	public GetLanguage(McJobs plugin){
		this.plugin = plugin;
		this.fcLocal = null;
		this.dLocal = null;
	}
<<<<<<< HEAD

=======
	
>>>>>>> origin3/master
	public String getEntity(String entName){
		String name = null;
		String temp = entName.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("entities");
<<<<<<< HEAD

		name = section.getString(temp);

		if(name == null)
			name = "Unknown value: " + entName;

		return PrettyText.colorText(name);
	}

=======
		
		name = section.getString(temp);
		
		if(name == null)
			name = "Unknown value: " + entName;
		
		return PrettyText.colorText(name);
	}
	
>>>>>>> origin3/master
	public String getMaterial(String matName){
		String name = null;
		String temp = matName.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("materials");
<<<<<<< HEAD

		name = section.getString(temp);

		if(name == null)
			name = "Unknown value: " + matName;

=======
		
		name = section.getString(temp);
		
		if(name == null)
			name = "Unknown value: " + matName;
		
>>>>>>> origin3/master
		return PrettyText.colorText(name);
	}

	public String getPotion(String potName){
		String name = null;
		String temp = potName.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("potions");
<<<<<<< HEAD

		name = section.getString(temp);

		if(name == null)
			name = "Unknown value: " + potName;

=======
		
		name = section.getString(temp);
		
		if(name == null)
			name = "Unknown value: " + potName;
		
>>>>>>> origin3/master
		return PrettyText.colorText(name);
	}

	public String getEnchant(String enchantName){
		String name = null;
		String temp = enchantName.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("enchant");
<<<<<<< HEAD

		name = section.getString(temp);

		if(name == null)
			name = "Unknown value: " + enchantName;

=======
		
		name = section.getString(temp);
		
		if(name == null)
			name = "Unknown value: " + enchantName;
		
>>>>>>> origin3/master
		return PrettyText.colorText(name);
	}

	public AddTextVariables getJobCommand(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobscommand");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
		return addText;		
>>>>>>> origin3/master
	}

	public AddTextVariables getJobDisplay(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobsdisplay");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
		return addText;		
>>>>>>> origin3/master
	}

	public AddTextVariables getJobNotify(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobsnotify");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
		return addText;		
>>>>>>> origin3/master
	}

	public AddTextVariables getJobJoin(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobsjoin");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
		return addText;		
	}
	
>>>>>>> origin3/master
	public AddTextVariables getJobLeave(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobsleave");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
		return addText;		
	}
	
>>>>>>> origin3/master
	public AddTextVariables getJobList(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobslist");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
		return addText;
	}
	
>>>>>>> origin3/master
	public AddTextVariables getJobHelp(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobshelp");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
>>>>>>> origin3/master
		return addText;
	}

	public AddTextVariables getAdminCommand(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("admincommand");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
>>>>>>> origin3/master
		return addText;
	}

	public AddTextVariables getAdminAdd(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("adminadd");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
		return addText;
	}
	
>>>>>>> origin3/master
	public AddTextVariables getAdminRemove(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("adminremove");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
>>>>>>> origin3/master
		return addText;
	}

	public AddTextVariables getAdminList(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("adminlist");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
>>>>>>> origin3/master
		return addText;
	}

	public AddTextVariables getAdminLogin(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("onadminlogin");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
>>>>>>> origin3/master
		return addText;
	}

	public AddTextVariables getPitch(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("pitch");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
>>>>>>> origin3/master
		return addText;
	}

	public AddTextVariables getPayment(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("payment");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
>>>>>>> origin3/master
		return addText;
	}

	public AddTextVariables getExperience(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("experience");
<<<<<<< HEAD

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public Integer getSpaces(String subSection){
		ConfigurationSection section = fcLocal.getConfigurationSection("spaces");

		return section.getInt(subSection);
	}

	public void loadLanguage(String lang) throws InvalidConfigurationException{
		String language;

=======
		
		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);
		
		AddTextVariables addText = new AddTextVariables(sString);
		
		return addText;
	}
	
	public Integer getSpaces(String subSection){
		ConfigurationSection section = fcLocal.getConfigurationSection("spaces");
		
		return section.getInt(subSection);
	}
	
	public void loadLanguage(String lang) throws InvalidConfigurationException{
		String language;
		
>>>>>>> origin3/master
		if(lang == null || lang == "")
			language = "english";
		else
			language = lang;
<<<<<<< HEAD

=======
		
>>>>>>> origin3/master
		if(fcLocal == null){
			if(language.equalsIgnoreCase("custom")){
				if(dLocal == null){
					dLocal = new File(plugin.getDataFolder(), "custom.yml");
				}
				fcLocal = YamlConfiguration.loadConfiguration(dLocal);
<<<<<<< HEAD

				InputStream isLocal = plugin.getResource("english.yml");

				if(!dLocal.exists()){
					YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(isLocal));
=======
				
				InputStream isLocal = plugin.getResource("english.yml");

				if(!dLocal.exists()){
					YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(isLocal);
>>>>>>> origin3/master


					fcLocal.setDefaults(defConfig);

					try {
						isLocal = plugin.getResource("english.yml");
<<<<<<< HEAD
						fcLocal.load(new InputStreamReader(isLocal));
=======
						fcLocal.load(isLocal);
>>>>>>> origin3/master
					} catch (IOException e1) {
						McJobs.getPlugin().getLogger().info("Unable to load english.yml to custom.yml");
					}

					try {
						fcLocal.save(dLocal);
					} catch (IOException e) {
						McJobs.getPlugin().getLogger().info("Unable to save custom.yml!");
					}
				}
				else{
					McJobs.getPlugin().getLogger().info("Loading custom.yml...");
					YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(dLocal);
					fcLocal.setDefaults(defConfig);
				}
			}
			else{
				String filename = language.toLowerCase() + ".yml";

				if(dLocal == null){
					dLocal = new File(plugin.getDataFolder(), filename);
				}
				fcLocal = YamlConfiguration.loadConfiguration(dLocal);
<<<<<<< HEAD

				InputStream isLocal = plugin.getResource(filename);
				if(isLocal != null){
					YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(isLocal));
=======
				
				InputStream isLocal = plugin.getResource(filename);
				if(isLocal != null){
					YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(isLocal);
>>>>>>> origin3/master
					fcLocal.setDefaults(defConfig);
				}
				else{
					plugin.getLogger().info(filename + " is not a valid language file!  Using English instead.");

					dLocal = new File(plugin.getDataFolder(), "english.yml");
					fcLocal = YamlConfiguration.loadConfiguration(dLocal);
<<<<<<< HEAD

					isLocal = plugin.getResource("english.yml");

					if(isLocal != null){
						YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(isLocal));
=======
					
					isLocal = plugin.getResource("english.yml");
					
					if(isLocal != null){
						YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(isLocal);
>>>>>>> origin3/master
						fcLocal.setDefaults(defConfig);
					}
				}
			}
		}
	}
}
