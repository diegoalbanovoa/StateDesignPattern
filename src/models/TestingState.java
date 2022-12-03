public class TestingState implements ProjectState
{
		@Override
		public void doRequirmentGathering()
		{
				System.out.println("No se puede realizar la 'Recopilación de requisitos' porque el proyecto está en la fase de 'Prueba'...");
		}

		@Override
		public void doDesignAndArchitecture()
		{
				System.out.println("No se puede hacer 'Diseño y Arquitectura' porque el Proyecto está en Fase de 'Prueba'...");
		}

		@Override
		public void doDevelopement()
		{
				System.out.println("'Desarrollo' [Corrección de errores] que puede hacer en la fase de 'Prueba' .......");

		}

		@Override
		public void doTesting()
		{
				System.out.println("Se ha iniciado la 'prueba' .............");

				System.out.println("'Prueba' se ha terminado por 20 días .............");

		}

}
