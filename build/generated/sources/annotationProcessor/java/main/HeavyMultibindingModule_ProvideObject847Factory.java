import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeavyMultibindingModule_ProvideObject847Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject847Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject847(module);
  }

  public static HeavyMultibindingModule_ProvideObject847Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject847Factory(module);
  }

  public static Object provideObject847(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject847());
  }
}
