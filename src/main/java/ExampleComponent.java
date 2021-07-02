import dagger.Component;

import java.util.Set;

@Component(
	modules = {
		HeavyMultibindingModule.class
	}
)
interface ExampleComponent {
	Set<Object> getElements();
}
