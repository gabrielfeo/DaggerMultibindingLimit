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
public final class HeavyMultibindingModule_ProvideObject398Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject398Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject398(module);
  }

  public static HeavyMultibindingModule_ProvideObject398Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject398Factory(module);
  }

  public static Object provideObject398(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject398());
  }
}
