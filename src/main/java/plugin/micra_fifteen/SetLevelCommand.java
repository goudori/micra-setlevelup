package plugin.micra_fifteen;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

//  CommandExecutor　→コマンド実行する
//  CommandExecutorを作った後に、onCommandを作る事
// プレイヤーレベルを上げるコマンド
public class SetLevelCommand implements CommandExecutor {

  //  args →/コマンド　引数(マイクラで使うコマンドの事)
  @Override
  public boolean onCommand(CommandSender sender, Command command, String s,
      String[] args) {
    if (sender instanceof Player player) {
      if (args.length == 1) {
        player.setLevel(Integer.parseInt(args[0]));

      } else {
        player.sendMessage("No");
      }
    }
    return false;
  }
}