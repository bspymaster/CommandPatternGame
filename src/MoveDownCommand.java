
public class MoveDownCommand implements Command {

	@Override
	public void execute(Actor targetActor) {
		targetActor.moveDown();
	}

}
