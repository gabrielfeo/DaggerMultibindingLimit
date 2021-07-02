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
public final class HeavyMultibindingModule_ProvideObject476Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject476Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject476(module);
  }

  public static HeavyMultibindingModule_ProvideObject476Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject476Factory(module);
  }

  public static Object provideObject476(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject476());
  }
}
