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
public final class HeavyMultibindingModule_ProvideObject309Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject309Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject309(module);
  }

  public static HeavyMultibindingModule_ProvideObject309Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject309Factory(module);
  }

  public static Object provideObject309(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject309());
  }
}
