public class DesignAndArchitectureState implements ProjectState
{
		@Override
		public void doRequirmentGathering()
		{
				System.out.println("'Recopilación de requisitos' [Aclaración de requisitos] que puede hacer en la fase de 'Diseño y arquitectura' .......");
		}

		@Override
		public void doDesignAndArchitecture()
		{
				System.out.println("'Diseño y Arquitectura' se ha iniciado ...............");

				System.out.println("'Diseño y Arquitectura' ha sido terminado por 10 días .............");
		}

		@Override
		public void doDevelopement()
		{
				System.out.println("No se puede hacer 'desarrollo' porque el proyecto está en la fase de 'Arquitectura de diseño'...");

		}

		@Override
		public void doTesting()
		{
				System.out.println("No se puede hacer 'Prueba' porque el Proyecto está en Fase de 'Diseño y Arquitectura'...");

		}

}