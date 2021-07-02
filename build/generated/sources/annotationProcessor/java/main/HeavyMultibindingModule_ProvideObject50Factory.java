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
public final class HeavyMultibindingModule_ProvideObject50Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject50Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject50(module);
  }

  public static HeavyMultibindingModule_ProvideObject50Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject50Factory(module);
  }

  public static Object provideObject50(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject50());
  }
}
