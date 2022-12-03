public class ClientController
{

		public static void main( String[] args )
		{
				/*
				 * Inicialmente Proyecto en 'RequirementGatheringState'
				 */
				Project project = new Project();

				System.out.println("El estado interno del proyecto es  : " + project.getProjectState().getClass().getName()+"\n");

				project.doDesignAndArchitecture();
				project.doDevelopement();
				project.doTesting();
				project.doRequirmentGathering();

				System.out.println();

				
				project.doDesignAndArchitecture();
				
				project.doTesting();
				
				project.doDevelopement();
				
				project.doRequirmentGathering();

		}

}