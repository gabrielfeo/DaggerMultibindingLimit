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
public final class HeavyMultibindingModule_ProvideObject588Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject588Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject588(module);
  }

  public static HeavyMultibindingModule_ProvideObject588Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject588Factory(module);
  }

  public static Object provideObject588(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject588());
  }
}
