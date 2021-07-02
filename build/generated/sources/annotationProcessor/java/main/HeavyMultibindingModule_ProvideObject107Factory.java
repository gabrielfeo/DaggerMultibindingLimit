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
public final class HeavyMultibindingModule_ProvideObject107Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject107Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject107(module);
  }

  public static HeavyMultibindingModule_ProvideObject107Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject107Factory(module);
  }

  public static Object provideObject107(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject107());
  }
}
