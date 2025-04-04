import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class gameManager {

	static UI ui = new UI();



	public static void main(String[] args) {

		Timer timerEgg = new Timer(15000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ui.pet1.hygieneDecrease();

				if(ui.pet1.hygiene >= 10){
					((Timer)e.getSource()).stop();
				}

				if((ui.pet1.happiness == 0) || (ui.pet1.hunger == 0) || (ui.pet1.hygiene== 0) ){
					((Timer)e.getSource()).stop();
					System.out.println("stats is now 0 ending timer");
					exit(0);
				}

			}
		});

		Timer timerChild = new Timer(15000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ui.pet1.hungerDecrease();
				ui.pet1.hygieneDecrease();

				if(ui.pet1.hygiene >= 10 && ui.pet1.hunger >= 10){
					((Timer)e.getSource()).stop();
				}

				//stops timer if any stat reaches 0
				if((ui.pet1.happiness == 0) || (ui.pet1.hunger == 0) || (ui.pet1.hygiene== 0) ){
					((Timer)e.getSource()).stop();
					System.out.println("stats is now 0 ending timer");
					exit(0);
				}
			}
		});

		Timer timerAdult = new Timer(15000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ui.pet1.hungerDecrease();
				ui.pet1.hygieneDecrease();
				ui.pet1.happinessDecrease();
				if((ui.pet1.happiness == 0) || (ui.pet1.hunger == 0) || (ui.pet1.hygiene== 0) ){
					((Timer)e.getSource()).stop();
					System.out.println("stats is now 0 ending timer");
					exit(0);
				}
			}
		});


		ui.createMainField();
		ui.createBackground();
		timerEgg.start();
		while(timerEgg.isRunning()){}
		timerEgg.stop();
		ui.switchToChildBG();
		timerChild.start();
		while(timerChild.isRunning()){}
		timerChild.stop();
		ui.switchToAdultBG();
		timerAdult.start();
		while(timerAdult.isRunning()){}
		timerAdult.stop();
		System.out.println("Game Over");
	}

}

