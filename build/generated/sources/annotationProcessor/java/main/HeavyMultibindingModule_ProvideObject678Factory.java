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
public final class HeavyMultibindingModule_ProvideObject678Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject678Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject678(module);
  }

  public static HeavyMultibindingModule_ProvideObject678Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject678Factory(module);
  }

  public static Object provideObject678(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject678());
  }
}
