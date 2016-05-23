
public class MoveLeftCommand implements Command {

	@Override
	public void execute(Actor targetActor) {
		targetActor.moveLeft();
	}

}
