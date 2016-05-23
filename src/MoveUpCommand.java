
public class MoveUpCommand implements Command {

	@Override
	public void execute(Actor targetActor) {
		targetActor.moveUp();
	}

}
