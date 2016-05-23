
public class MoveRightCommand implements Command {

	@Override
	public void execute(Actor targetActor) {
		targetActor.moveRight();
	}

}
