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
public final class HeavyMultibindingModule_ProvideObject607Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject607Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject607(module);
  }

  public static HeavyMultibindingModule_ProvideObject607Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject607Factory(module);
  }

  public static Object provideObject607(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject607());
  }
}
