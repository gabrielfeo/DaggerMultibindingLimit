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
public final class HeavyMultibindingModule_ProvideObject13Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject13Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject13(module);
  }

  public static HeavyMultibindingModule_ProvideObject13Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject13Factory(module);
  }

  public static Object provideObject13(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject13());
  }
}
