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
public final class HeavyMultibindingModule_ProvideObject195Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject195Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject195(module);
  }

  public static HeavyMultibindingModule_ProvideObject195Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject195Factory(module);
  }

  public static Object provideObject195(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject195());
  }
}
