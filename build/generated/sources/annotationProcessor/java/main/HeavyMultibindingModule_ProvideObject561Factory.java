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
public final class HeavyMultibindingModule_ProvideObject561Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject561Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject561(module);
  }

  public static HeavyMultibindingModule_ProvideObject561Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject561Factory(module);
  }

  public static Object provideObject561(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject561());
  }
}
