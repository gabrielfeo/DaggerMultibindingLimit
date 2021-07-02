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
public final class HeavyMultibindingModule_ProvideObject370Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject370Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject370(module);
  }

  public static HeavyMultibindingModule_ProvideObject370Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject370Factory(module);
  }

  public static Object provideObject370(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject370());
  }
}
