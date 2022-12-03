public class RequirementGatheringState implements ProjectState
{

		@Override
		public void doRequirmentGathering()
		{
				System.out.println("Se ha iniciado la 'recopilación de requisitos' .............");

				System.out.println("'Recopilación de requisitos' se ha terminado en 7 días .............");

		}

		@Override
		public void doDesignAndArchitecture()
		{
				System.out.println("No se puede hacer 'Diseño y arquitectura' porque el proyecto está en la fase de 'Recopilación de requisitos'...");

		}

		@Override
		public void doDevelopement()
		{
				System.out.println("No se puede hacer 'desarrollo' porque el proyecto está en la fase de 'Recopilación de requisitos'...");

		}

		@Override
		public void doTesting()
		{
				System.out.println("No se puede hacer 'Prueba' porque el proyecto está en la fase de 'Recopilación de requisitos'...");

		}

}