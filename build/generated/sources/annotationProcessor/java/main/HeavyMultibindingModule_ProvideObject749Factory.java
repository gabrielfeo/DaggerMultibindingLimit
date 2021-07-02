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
public final class HeavyMultibindingModule_ProvideObject749Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject749Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject749(module);
  }

  public static HeavyMultibindingModule_ProvideObject749Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject749Factory(module);
  }

  public static Object provideObject749(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject749());
  }
}
