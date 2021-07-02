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
public final class HeavyMultibindingModule_ProvideObject869Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject869Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject869(module);
  }

  public static HeavyMultibindingModule_ProvideObject869Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject869Factory(module);
  }

  public static Object provideObject869(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject869());
  }
}
