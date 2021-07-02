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
public final class HeavyMultibindingModule_ProvideObject605Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject605Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject605(module);
  }

  public static HeavyMultibindingModule_ProvideObject605Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject605Factory(module);
  }

  public static Object provideObject605(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject605());
  }
}
