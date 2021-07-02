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
public final class HeavyMultibindingModule_ProvideObject186Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject186Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject186(module);
  }

  public static HeavyMultibindingModule_ProvideObject186Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject186Factory(module);
  }

  public static Object provideObject186(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject186());
  }
}
