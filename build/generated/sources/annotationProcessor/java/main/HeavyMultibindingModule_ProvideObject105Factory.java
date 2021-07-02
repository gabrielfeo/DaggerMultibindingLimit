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
public final class HeavyMultibindingModule_ProvideObject105Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject105Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject105(module);
  }

  public static HeavyMultibindingModule_ProvideObject105Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject105Factory(module);
  }

  public static Object provideObject105(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject105());
  }
}
