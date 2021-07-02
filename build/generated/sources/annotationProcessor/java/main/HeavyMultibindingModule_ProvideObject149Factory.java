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
public final class HeavyMultibindingModule_ProvideObject149Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject149Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject149(module);
  }

  public static HeavyMultibindingModule_ProvideObject149Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject149Factory(module);
  }

  public static Object provideObject149(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject149());
  }
}
