// This is like Context
public class Project implements ProjectState {

	private ProjectState projectState;

	public Project() {
		projectState = new RequirementGatheringState();
	}

	public ProjectState getProjectState() {
		return projectState;
	}

	public void setProjectState(ProjectState projectState) {
		this.projectState = projectState;
	}

	@Override
	public void doRequirmentGathering() {
		projectState.doRequirmentGathering();
		/*
		 * Una vez que finalice la recopilación de requisitos, el estado interno del
		 * proyecto se moverá a DesignAndArchitectureState
		 */
		if (projectState instanceof RequirementGatheringState) {
			setProjectState(new DesignAndArchitectureState());
			System.out.println("\nProject internal state moved to : " + projectState.getClass().getName() + "\n");
		}

	}

	@Override
	public void doDesignAndArchitecture() {
		projectState.doDesignAndArchitecture();

		/*
		 * Una vez que el diseño y la arquitectura estén terminados, el estado interno
		 * del proyecto se moverá al estado de desarrollo.
		 */
		if (projectState instanceof DesignAndArchitectureState) {
			setProjectState(new DevelopementState());
			System.out.println("\nProject internal state moved to : " + projectState.getClass().getName() + "\n");
		}

	}

	@Override
	public void doDevelopement() {
		projectState.doDevelopement();

		/*
		 * Una vez que finalice el desarrollo, el estado interno del proyecto se moverá
		 * a TestingState
		 */

		if (projectState instanceof DevelopementState) {
			setProjectState(new TestingState());
			System.out.println("\nProject internal state moved to : " + projectState.getClass().getName() + "\n");
		}

	}

	@Override
	public void doTesting() {
		projectState.doTesting();

	}

}