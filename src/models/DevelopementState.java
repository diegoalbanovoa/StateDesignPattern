public class DevelopementState implements ProjectState
{
		@Override
		public void doRequirmentGathering()
		{
				System.out.println("No se puede realizar la 'Recopilación de requisitos' porque el proyecto está en la fase de 'Desarrollo'...");
		}

		@Override
		public void doDesignAndArchitecture()
		{
				System.out.println("Diseño y Arquitectura'[Aclaración de Diseño y Arquitectura] que puedes hacer en Fase de 'Desarrollo' .......'");
		}

		@Override
		public void doDevelopement()
		{
				System.out.println("Se ha iniciado el 'Desarrollo' .............");

				System.out.println("El desarrollo se ha terminado en 40 días .............'");

		}

		@Override
		public void doTesting()
		{
				System.out.println("Cannot do 'Testing' because Project is in 'Developement' Phase...");

		}

}
