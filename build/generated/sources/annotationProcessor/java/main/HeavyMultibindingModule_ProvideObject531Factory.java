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
public final class HeavyMultibindingModule_ProvideObject531Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject531Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject531(module);
  }

  public static HeavyMultibindingModule_ProvideObject531Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject531Factory(module);
  }

  public static Object provideObject531(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject531());
  }
}
